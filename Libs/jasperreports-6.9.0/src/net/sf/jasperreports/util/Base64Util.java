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
package net.sf.jasperreports.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Base64;
/**
 * Utility class to decode Base64 encoded input stream to output stream 
 * or to Base64 enc/*
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
package net.sf.jasperreports.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Base64;
/**
 * Utility class to decode Base64 encoded input stream to output stream 
 * or to Base64 encode input stream to output stream
 * 
 * @author Sanda Zaharia (shertage@users.sourceforge.net)
 */
public class Base64Util
{
	public static final Integer DEFAULT_LINE_LENGTH = 76;
	public static final byte[] DEFAULT_LINE_SEPARATOR = "\n".getBytes();
	
	/**
	 * Decode an input stream and write processed data to an output stream
	 * @param in the input stream to be decoded
	 * @param out the output stream to write the decoded data
	 * @throws IOException
	 */
	public static void decode(InputStream in, OutputStream out) throws IOException
	{
		InputStream base64in = Base64.getMimeDecoder().wrap(in);

		copy(base64in, out);
	}
	
	/**
	 * Encode an input stream and write processed data to an output stream
	 * @param in the input stream to be encoded
	 * @param out the output stream to write the encoded data
	 * @throws IOException
	 */
	public static void encode(InputStream in, OutputStream out) throws IOException
	{
		OutputStream base64out = Base64.getMimeEncoder(DEFAULT_LINE_LENGTH, DEFAULT_LINE_SEPARATOR).wrap(out);
	
		copy(in, base64out);
		
		// need to close this here so that it adds base64 padding ('=' characters) at the end of the stream
		base64out.close();
	}
	
	/**
	 * @param in the input stream to be read
	 * @param out the output stream to write
	 * @throws IOException
	 */
	private static void copy(InputStream in, OutputStream out) throws IOException
	{
		byte[] bytes = new byte[10000];
		int ln = 0;
		while ((ln = in.read(bytes)) > 0)
		{
			out.write(bytes, 0, ln);
		}

		out.flush();
	}
}
