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
package net.sf.jasperreports.engine.json.expression.member;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.json.JsonNodeContainer;
import net.sf.jasperreports.engine.json.expression.member.evaluation.MemberExpressionEvaluatorVisitor;

/**
 * @author Narcis Marcu (narcism@users.sourceforge.net)
 */
public class ArrayConstructionExpression extends AbstractMemberExpression {
    private List<Integer> indexes;


    public ArrayConstructionExpression() {
        indexes = new ArrayList<>();
    }

    @Override
    public JsonNodeContainer evaluate(JsonNodeContainer nodeContainer, MemberExpressionEvaluatorVisitor evaluator) {
        return evaluator.evaluateArrayConstruction(this, nodeContainer);
    }

    public void addIndex(int/*
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
package net.sf.jasperreports.engine.json.expression.member;

import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.json.JsonNodeContainer;
import net.sf.jasperreports.engine.json.expression.member.evaluation.MemberExpressionEvaluatorVisitor;

/**
 * @author Narcis Marcu (narcism@users.sourceforge.net)
 */
public class ArrayConstructionExpression extends AbstractMemberExpression {
    private List<Integer> indexes;


    public ArrayConstructionExpression() {
        indexes = new ArrayList<>();
    }

    @Override
    public JsonNodeContainer evaluate(JsonNodeContainer nodeContainer, MemberExpressionEvaluatorVisitor evaluator) {
        return evaluator.evaluateArrayConstruction(this, nodeContainer);
    }

    public void addIndex(int index) {
        indexes.add(index);
    }

    public List<Integer> getIndexes() {
        return indexes;
    }

    @Override
    public String toString() {
        String result = getDirection() + " " + indexes;
        if (getFilterExpression() != null) {
            result += "(" + getFilterExpression() + ")";
        }
        return result;
    }
}
