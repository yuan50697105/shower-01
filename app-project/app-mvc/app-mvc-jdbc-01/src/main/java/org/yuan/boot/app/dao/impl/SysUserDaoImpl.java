package org.yuan.boot.app.dao.impl;

import com.jn.sqlhelper.dialect.pagination.PagingResult;
import org.springframework.stereotype.Repository;
import org.yuan.boot.app.dao.SysUserDao;
import org.yuan.boot.app.pojo.SysUser;
import org.yuan.boot.jdbc.dao.impl.BaseDaoImpl;

import java.util.ArrayList;

@Repository
public class SysUserDaoImpl extends BaseDaoImpl<SysUser> implements SysUserDao {
    @Override
    public PagingResult<SysUser> selectList(SysUser sysUser, int page, int size) {
        SQLQuery SQLQuery = new SQLQuery(sysUser).invoke();
        ArrayList<Object> objects = SQLQuery.getObjects();
        String sql = SQLQuery.getSql();
        return selectList(sql, page, size, objects);
    }

    private static class SQLQuery {
        private SysUser sysUser;
        private ArrayList<Object> objects;
        private String sql;

        public SQLQuery(SysUser sysUser) {
            this.sysUser = sysUser;
        }

        public ArrayList<Object> getObjects() {
            return objects;
        }

        public String getSql() {
            return sql;
        }

        public SQLQuery invoke() {
            StringBuilder stringBuilder = new StringBuilder();
            objects = new ArrayList<>();
            stringBuilder.append("select id, username, password, real_name, nick_name ");
            stringBuilder.append("from sys_user ");
//            if (ObjectUtil.isNotEmpty(sysUser)) {
//                stringBuilder.append("where 1 = 1 ");
//                if (ObjectUtil.isNotEmpty(sysUser.getId())) {
//                    stringBuilder.append("  and id = :id ");
//                }
//                stringBuilder.append("  and username like concat('%', :username, '%') ");
//                stringBuilder.append("  and real_name like concat('%', :realName, '%') ");
//                stringBuilder.append("  and nick_name like concat('%', :nickName, '%')");
//            }
            sql = stringBuilder.toString();
            return this;
        }
    }
}
