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
package net.sf.jasperreports.customizers.marker;

import org.jfree.chart.plot.ValueMarker;

/**
 * This customizer plots a line chart as spline.
 * 
 * @author Giulio Toffoli (gt78@users.sourceforge.net)
 */
public abstract class AbstractValueMarkerCustomizer extends AbstractMarkerCustomizer 
{
	public static final String PROPERTY_VALUE = "value";


	protected ValueMarker createMarker() 
	{
		Double value = getDoubleProperty(PROPERTY_VALUE);

		if (value == null)
		{
			return null;
		}

		ValueMarker marker = new ValueMarker(value);

		configureMarker(marker);

		configureStroke(marker);

		return marker;
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  /*
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
package net.sf.jasperreports.customizers.marker;

import org.jfree.chart.plot.ValueMarker;

/**
 * This customizer plots a line chart as spline.
 * 
 * @author Giulio Toffoli (gt78@users.sourceforge.net)
 */
public abstract class AbstractValueMarkerCustomizer extends AbstractMarkerCustomizer 
{
	public static final String PROPERTY_VALUE = "value";


	protected ValueMarker createMarker() 
	{
		Double value = getDoubleProperty(PROPERTY_VALUE);

		if (value == null)
		{
			return null;
		}

		ValueMarker marker = new ValueMarker(value);

		configureMarker(marker);

		configureStroke(marker);

		return marker;
	}
}
