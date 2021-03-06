/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.sql.expression.gen.script;

import org.elasticsearch.xpack.sql.expression.function.grouping.GroupingFunctionAttribute;

class Grouping extends Param<GroupingFunctionAttribute> {

    Grouping(GroupingFunctionAttribute groupRef) {
        super(groupRef);
    }

    String groupName() {
        return value().functionId();
    }

    @Override
    public String prefix() {
        return "g";
    }
}