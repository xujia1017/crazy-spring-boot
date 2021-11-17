/*
 * This file is generated by jOOQ.
 */
package org.crazyit.generated;


import org.crazyit.generated.tables.UserInf;
import org.crazyit.generated.tables.records.UserInfRecord;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * springboot.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<UserInfRecord> KEY_USER_INF_PRIMARY =
            Internal.createUniqueKey(UserInf.USER_INF, DSL.name("KEY_user_inf_PRIMARY"),
                    new TableField[] {UserInf.USER_INF.USER_ID}, true);
}
