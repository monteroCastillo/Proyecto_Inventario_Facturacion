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
package net.sf.jasperreports.repo;

import net.sf.jasperreports.data.DataAdapter;
import net.sf.jasperreports.engine.JasperReportsContext;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 */
public class CastorDataAdapterPersistenceService extends CastorObjectPersistenceService
{

	/**
	 * 
	 */
	public CastorDataAdapterPersistenceService(JasperReportsContext jasperReportsContext)
	{
		super(jasperReportsContext);
	}

	
	@Override
	public Resource load(String uri, RepositoryService repositoryService)
	{
		return load(null, uri, repositoryService);
	}
	
	@Override
	public Resource load(RepositoryContext context, String uri, RepositoryService repositoryService)
	{
		DataAdapterResource dataAdapterResource = null;
		
		CastorResource resource = (CastorResource)super.load(context, uri, repositoryService);
		
		if (resource != null)
		{
			dataAdapterResource = new DataAdapterResource();
			dataAdapterResource.setValue((DataAdapter)resource.getValue());
		}
		
		return dataAdapterResource;
	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     /*
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
package net.sf.jasperreports.repo;

import net.sf.jasperreports.data.DataAdapter;
import net.sf.jasperreports.engine.JasperReportsContext;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 */
public class CastorDataAdapterPersistenceService extends CastorObjectPersistenceService
{

	/**
	 * 
	 */
	public CastorDataAdapterPersistenceService(JasperReportsContext jasperReportsContext)
	{
		super(jasperReportsContext);
	}

	
	@Override
	public Resource load(String uri, RepositoryService repositoryService)
	{
		return load(null, uri, repositoryService);
	}
	
	@Override
	public Resource load(RepositoryContext context, String uri, RepositoryService repositoryService)
	{
		DataAdapterResource dataAdapterResource = null;
		
		CastorResource resource = (CastorResource)super.load(context, uri, repositoryService);
		
		if (resource != null)
		{
			dataAdapterResource = new DataAdapterResource();
			dataAdapterResource.setValue((DataAdapter)resource.getValue());
		}
		
		return dataAdapterResource;
	}

}
