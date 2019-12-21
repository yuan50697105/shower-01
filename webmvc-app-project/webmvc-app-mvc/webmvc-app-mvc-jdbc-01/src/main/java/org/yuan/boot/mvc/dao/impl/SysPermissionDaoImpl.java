package org.yuan.boot.mvc.dao.impl;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.stereotype.Repository;
import org.yuan.boot.db.jdbc.dao.impl.BaseDaoImpl;
import org.yuan.boot.mvc.dao.SysPermissionDao;
import org.yuan.boot.mvc.pojo.SysPermission;
import org.yuan.boot.mvc.pojo.dto.SysPermissionCondition;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Repository
public class SysPermissionDaoImpl extends BaseDaoImpl<SysPermission> implements SysPermissionDao {
    @Override
    public PagingResult<SysPermission> selectList(SysPermissionCondition condition, int page, int size) {
        ConditionQuery conditionQuery = new ConditionQuery(condition).invoke();
        HashMap<String, Object> map = conditionQuery.getMap();
        String sql = conditionQuery.getSql();
        return selectList(sql, page, size, map);
    }

    @Override
    public List<SysPermission> selectList(SysPermissionCondition condition) {
        ConditionQuery invoke = new ConditionQuery(condition).invoke();
        return selectList(invoke.getSql(), invoke.getMap());
    }

    @Override
    public Optional<SysPermission> selectOne(SysPermission permission) {
        ExampleQuyer exampleQuyer = new ExampleQuyer(permission).invoke();
        HashMap<String, Object> map = exampleQuyer.getMap();
        String sql = exampleQuyer.getSql();
        return selectOne(sql, map);
    }

    private class ConditionQuery {
        private SysPermissionCondition condition;
        private HashMap<String, Object> map;
        private String sql;

        public ConditionQuery(SysPermissionCondition condition) {
            this.condition = condition;
        }

        public HashMap<String, Object> getMap() {
            return map;
        }

        public String getSql() {
            return sql;
        }

        public ConditionQuery invoke() {
            map = new HashMap<>(condition.getClass().getFields().length);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("select id, name, create_user, update_user, create_time, update_time ");
            stringBuilder.append("from sys_permission ");
            if (isNotEmpty(condition)) {
                stringBuilder.append("where 1 = 1 ");
                if (isNotEmpty(condition.getId())) {
                    stringBuilder.append("  and id = :id ");
                    map.put("id", condition.getId());
                }
                if (isNotEmpty(condition.getIds())) {
                    stringBuilder.append("  and id in (:ids) ");
                    map.put("ids", condition.getIds());
                }
                if (isNotEmpty(condition.getName())) {
                    stringBuilder.append("  and name like concat('%', :name, '%')");
                    map.put("name", condition.getName());
                }
            }
            sql = stringBuilder.toString();
            return this;
        }
    }

    private class ExampleQuyer {
        private SysPermission permission;
        private HashMap<String, Object> map;
        private String sql;

        public ExampleQuyer(SysPermission permission) {
            this.permission = permission;
        }

        public HashMap<String, Object> getMap() {
            return map;
        }

        public String getSql() {
            return sql;
        }

        public ExampleQuyer invoke() {
            map = new HashMap<>(permission.getClass().getFields().length);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("select id, name, create_user, update_user, create_time, update_time ");
            stringBuilder.append("from sys_permission ");
            if (isNotEmpty(permission)) {
                stringBuilder.append("where 1 = 1 ");
                stringBuilder.append("and id = :id ");
                stringBuilder.append("and name = :name");
            }
            sql = stringBuilder.toString();
            return this;
        }
    }
}
