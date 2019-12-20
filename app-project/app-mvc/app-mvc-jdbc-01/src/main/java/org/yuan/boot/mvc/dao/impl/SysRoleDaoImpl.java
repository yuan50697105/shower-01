package org.yuan.boot.mvc.dao.impl;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.stereotype.Repository;
import org.yuan.boot.db.jdbc.dao.impl.BaseDaoImpl;
import org.yuan.boot.mvc.dao.SysRoleDao;
import org.yuan.boot.mvc.pojo.SysRole;
import org.yuan.boot.mvc.pojo.dto.SysRoleCondition;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Repository
public class SysRoleDaoImpl extends BaseDaoImpl<SysRole> implements SysRoleDao {
    @Override
    public PagingResult<SysRole> selectList(SysRoleCondition condition, int page, int size) {
        ConditionQuery conditionQuery = new ConditionQuery(condition).invoke();
        HashMap<String, Object> map = conditionQuery.getMap();
        String sql = conditionQuery.getSql();
        return selectList(sql, page, size, map);
    }

    @Override
    public List<SysRole> selectList(SysRoleCondition condition) {
        ConditionQuery conditionQuery = new ConditionQuery(condition).invoke();
        return selectList(conditionQuery.getSql(), conditionQuery.getMap());
    }

    @Override
    public Optional<SysRole> selectOne(SysRole sysRole) {
        ExampleQuery exampleQuery = new ExampleQuery(sysRole).invoke();
        HashMap<String, Object> map = exampleQuery.getMap();
        String sql = exampleQuery.getSql();
        return selectOne(sql, map);
    }

    private class ConditionQuery {
        private SysRoleCondition condition;
        private HashMap<String, Object> map;
        private String sql;

        public ConditionQuery(SysRoleCondition condition) {
            this.condition = condition;
        }

        public HashMap<String, Object> getMap() {
            return map;
        }

        public String getSql() {
            return sql;
        }

        @SuppressWarnings("DuplicatedCode")
        public ConditionQuery invoke() {
            map = new HashMap<>(condition.getClass().getFields().length);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("select id, name, create_user, update_user, create_time, update_time ");
            stringBuilder.append("from sys_role ");
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

    private class ExampleQuery {
        private SysRole sysRole;
        private HashMap<String, Object> map;
        private String sql;

        public ExampleQuery(SysRole sysRole) {
            this.sysRole = sysRole;
        }

        public HashMap<String, Object> getMap() {
            return map;
        }

        public String getSql() {
            return sql;
        }

        public ExampleQuery invoke() {
            map = new HashMap<>(sysRole.getClass().getFields().length);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("select id, name, create_user, update_user, create_time, update_time ");
            stringBuilder.append("from sys_role ");
            if (isNotEmpty(sysRole)) {
                stringBuilder.append("where 1 = 1 ");
                if (isNotEmpty(sysRole.getId())) {
                    stringBuilder.append("  and id = :id ");
                    map.put("id", sysRole.getId());
                }
                if (isNotEmpty(sysRole.getName())) {
                    stringBuilder.append("  and name = :name ");
                    map.put("name", sysRole.getName());
                }
            }
            sql = stringBuilder.toString();
            return this;
        }
    }
}
