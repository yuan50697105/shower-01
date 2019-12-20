package org.yuan.boot.mvc.dao.impl;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.stereotype.Repository;
import org.yuan.boot.db.jdbc.dao.impl.BaseDaoImpl;
import org.yuan.boot.mvc.dao.SysUserDao;
import org.yuan.boot.mvc.pojo.SysUser;
import org.yuan.boot.mvc.pojo.dto.SysUserCondition;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuanez
 * @create: 2019-12-20 14:10
 **/
@Repository
public class SysUserDaoImpl extends BaseDaoImpl<SysUser> implements SysUserDao {
    @Override
    public PagingResult<SysUser> selectList(SysUserCondition condition, int page, int size) {
        ConditionQuery conditionQuery = new ConditionQuery(condition).invoke();
        String sql = conditionQuery.getSql();
        HashMap<String, Object> map = conditionQuery.getMap();
        return selectList(sql, page, size, map);
    }

    @Override
    public List<SysUser> selectList(SysUserCondition condition) {
        ConditionQuery conditionQuery = new ConditionQuery(condition).invoke();
        return selectList(conditionQuery.getSql(), conditionQuery.getMap());
    }

    @Override
    public Optional<SysUser> selectOne(SysUser sysUser) {
        ExampleQuery exampleQuery = new ExampleQuery(sysUser).invoke();
        String sql = exampleQuery.getSql();
        HashMap<String, Object> map = exampleQuery.getMap();
        return selectOne(sql, map);
    }

    private class ConditionQuery {
        private SysUserCondition condition;
        private String sql;
        private HashMap<String, Object> map;

        public ConditionQuery(SysUserCondition condition) {
            this.condition = condition;
        }

        public String getSql() {
            return sql;
        }

        public HashMap<String, Object> getMap() {
            return map;
        }

        public ConditionQuery invoke() {
            map = new HashMap<>(condition.getClass().getFields().length);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("select create_user, update_user, create_time, update_time, id, username, password ");
            stringBuilder.append("from sys_user ");
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
                    stringBuilder.append("  and (username like concat('%', :name, '%')) ");
                    map.put("name", condition.getName());
                }
                if (isNotEmpty(condition.getUsername())) {
                    stringBuilder.append("  and username like concat('%', :username, '%') ");
                    map.put("username", condition.getUsername());
                }
                if (isNotEmpty(condition.getCreateUser())) {
                    stringBuilder.append("  and create_user like concat('%', :createUser, '%') ");
                    map.put("createUser", condition.getCreateUser());
                }
                if (isNotEmpty(condition.getCreateDate())) {
                    stringBuilder.append("  and date(create_time) = date(:createDate) ");
                    map.put("createDate", condition.getCreateDate());
                }
                if (isNotEmpty(condition.getCreateDateStart())) {
                    stringBuilder.append("  and date(create_time) >= date(:createDateStart) ");
                    map.put("createDateStart", condition.getCreateDateStart());
                }
                if (isNotEmpty(condition.getCreateDateEnd())) {
                    stringBuilder.append("  and date(create_time) <= date(:createDateEnd)");
                    map.put("createDateEnd", condition.getCreateDateEnd());
                }
            }
            sql = stringBuilder.toString();
            return this;
        }
    }

    private class ExampleQuery {
        private SysUser sysUser;
        private String sql;
        private HashMap<String, Object> map;

        public ExampleQuery(SysUser sysUser) {
            this.sysUser = sysUser;
        }

        public String getSql() {
            return sql;
        }

        public HashMap<String, Object> getMap() {
            return map;
        }

        public ExampleQuery invoke() {
            map = new HashMap<>(sysUser.getClass().getFields().length);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("select create_user, update_user, create_time, update_time, id, username, password ");
            stringBuilder.append("from sys_user ");
            if (isNotEmpty(sysUser)) {
                stringBuilder.append("where 1 = 1 ");
                if (isNotEmpty(sysUser.getId())) {
                    stringBuilder.append("  and id = :id ");
                    map.put("id", sysUser.getId());
                }
                if (isNotEmpty(sysUser.getUsername())) {
                    stringBuilder.append("  and username = :username");
                    map.put("username", sysUser.getUsername());
                }
            }
            sql = stringBuilder.toString();
            return this;
        }
    }
}
