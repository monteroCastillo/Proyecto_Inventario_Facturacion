/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2019 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.engine.util;

import java.awt.Font;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.fonts.FontUtil;

/**
 * A subclass of {@link ObjectInputStream} that uses
 * {@link Thread#getContextClassLoader() the context class loader} to resolve
 * classes encountered in the input stream.
 * 
 * @author Lucian Chirita (lucianc@users.sourceforge.net)
 */
public class ContextClassLoaderObjectInputStream extends ObjectInputStream
{
	private final JasperReportsContext jasperReportsContext;

	/**
	 * Creates an object input stream that reads data from the specified
	 * {@link InputStream}.
	 * 
	 * @param in the input stream to read data from
	 * @throws IOException
	 * @see ObjectInputStream#ObjectInputStream(InputStream)
	 */
	public ContextClassLoaderObjectInputStream(JasperReportsContext jasperReportsContext, InputStream in) throws IOException
	{
		super(in);
		
		this.jasperReportsContext = jasperReportsContext;
		
		try
		{
			enableResolveObject(true);
		}
		catch(SecurityException ex)
		{
			//FIXMEFONT we silence this for applets. but are there other similar situations that we need to deal with by signing jars?
		}
	}

	/**
	 *
	 */
	public JasperReportsContext getJasperReportsContext()
	{
		return jasperReportsContext;
	}

	/**
	 * Calls <code>super.resolveClass()</code> and in case this fails with
	 * {@link ClassNotFoundException} attempts to load the class using the
	 * context class loader.
	 */
	@Override
	protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException,
			ClassNotFoundException
	{
		try
		{
			return super.resolveClass(desc);
		}
		catch (ClassNotFoundException e)
		{
			ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
			if (contextClassLoader == null)
			{
				throw e;
			}
			
			String name = desc.getName();
			try
			{
				//attempt to load the class using the context class loader
				return Class.forName(name, false, contextClassLoader);
			}
			catch (ClassNotFoundException e2)
			{
				//fallback to the original exception
				throw e;
			}
		}
	}

	
	/**
	 * Checks to see if the object is an instance of <code>java.awt.Font</code>, 
	 * and in case it is, it replaces it with the one looked up for in the font extensions.
	 */
	@Override
	protected Object resolveObject(Object obj) throws IOException
	{
		Font font = (obj instanceof Font) ? (Font)obj : null;
		
		if (font != null)
		{
			// We use the font.getName() method here because the name field in the java.awt.Font class is the only font name related information that gets serialized,
			// along with the size and style. The font.getFontName() and font.getFamily() both return runtime calculated values, which are not accurate in case of AWT fonts
			// created at runtime through font extensions (both seem to return 'Dialog').
			// For AWT fonts created from font extensions using the Font.createFont(int, InputStream), the name field is set to the same value as the font.getFontName(),
			// which is the recommended method to get the name of an AWT font.
			String fontName = font.getName();
			// We load an instance of an AWT font, even if the specified font name is not available (ignoreMissingFont=true),
			// because only third-party visualization packages such as JFreeChart (chart themes) store serialized java.awt.Font objects,
			// and they are responsible for the drawing as well.
			// Here we rely on the utility method ability to find a font by face name, not only family name. This is because font.getName() above returns an AWT font name,
			// not a font family name.
			Font newFont = FontUtil.getInstance(jasperReportsContext).getAwtFontFromBundles(fontName, font.getStyle(), font.getSize2D(), null, true);
			
			if (newFont != null)
			{
				return newFont.deriveFont(font.getAttributes());
			}
		}
		
		return obj;
	}


}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                /*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2019 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.engine.util;

import java.awt.Font;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.fonts.FontUtil;

/**
 * A subclass of {@link ObjectInputStream} that uses
 * {@link Thread#getContextClassLoader() the context class loader} to resolve
 * classes encountered in the input stream.
 * 
 * @author Lucian Chirita (lucianc@users.sourceforge.net)
 */
public class ContextClassLoaderObjectInputStream extends ObjectInputStream
{
	private final JasperReportsContext jasperReportsContext;

	/**
	 * Creates an object input stream that reads data from the specified
	 * {@link InputStream}.
	 * 
	 * @param in the input stream to read data from
	 * @throws IOException
	 * @see ObjectInputStream#ObjectInputStream(InputStream)
	 */
	public ContextClassLoaderObjectInputStream(JasperReportsContext jasperReportsContext, InputStream in) throws IOException
	{
		super(in);
		
		this.jasperReportsContext = jasperReportsContext;
		
		try
		{
			enableResolveObject(true);
		}
		catch(SecurityException ex)
		{
			//FIXMEFONT we silence this for applets. but are there other similar situations that we need to deal with by signing jars?
		}
	}

	/**
	 *
	 */
	public JasperReportsContext getJasperReportsContext()
	{
		return jasperReportsContext;
	}

	/**
	 * Calls <code>super.resolveClass()</code> and in case this fails with
	 * {@link ClassNotFoundException} attempts to load the class using the
	 * context class loader.
	 */
	@Override
	protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException,
			ClassNotFoundException
	{
		try
		{
			return super.resolveClass(desc);
		}
		catch (ClassNotFoundException e)
		{
			ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
			if (contextClassLoader == null)
			{
				throw e;
			}
			
			String name = desc.getName();
			try
			{
				//attempt to load the class using the context class loader
				return Class.forName(name, false, contextClassLoader);
			}
			catch (ClassNotFoundException e2)
			{
				//fallback to the original exception
				throw e;
			}
		}
	}

	
	/**
	 * Checks to see if the object is an instance of <code>java.awt.Font</code>, 
	 * and in case it is, it replaces it with the one looked up for in the font extensions.
	 */
	@Override
	protected Object resolveObject(Object obj) throws IOException
	{
		Font font = (obj instanceof Font) ? (Font)obj : null;
		
		if (font != null)
		{
			// We use the font.getName() method here because the name field in the java.awt.Font class is the only font name related information that gets serialized,
			// along with the size and style. The font.getFontName() and font.getFamily() both return runtime calculated values, which are not accurate in case of AWT fonts
			// created at runtime through font extensions (both seem to return 'Dialog').
			// For AWT fonts created from font extensions using the Font.createFont(int, InputStream), the name field is set to the same value as the font.getFontName(),
			// which is the recommended method to get the name of an AWT font.
			String fontName = font.getName();
			// We load an instance of an AWT font, even if the specified font name is not available (ignoreMissingFont=true),
			// because only third-party visualization packages such as JFreeChart (chart themes) store serialized java.awt.Font objects,
			// and they are responsible for the drawing as well.
			// Here we rely on the utility method ability to find a font by face name, not only family name. This is because font.getName() above returns an AWT font name,
			// not a font family name.
			Font newFont = FontUtil.getInstance(jasperReportsContext).getAwtFontFromBundles(fontName, font.getStyle(), font.getSize2D(), null, true);
			
			if (newFont != null)
			{
				return newFont.deriveFont(font.getAttributes());
			}
		}
		
		return obj;
	}


}
