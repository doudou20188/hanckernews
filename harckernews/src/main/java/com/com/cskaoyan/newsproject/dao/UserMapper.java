package com.com.cskaoyan.newsproject.dao;

import com.com.cskaoyan.newsproject.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_user_t
     *
     * @mbg.generated Tue Dec 18 22:51:58 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_user_t
     *
     * @mbg.generated Tue Dec 18 22:51:58 CST 2018
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_user_t
     *
     * @mbg.generated Tue Dec 18 22:51:58 CST 2018
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_user_t
     *
     * @mbg.generated Tue Dec 18 22:51:58 CST 2018
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_user_t
     *
     * @mbg.generated Tue Dec 18 22:51:58 CST 2018
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news_user_t
     *
     * @mbg.generated Tue Dec 18 22:51:58 CST 2018
     */
    int updateByPrimaryKey(User record);

    @Select("select * from news_user_t where username=#{username} and password=#{password}")
    User findUserFromDB(@Param("username") String username, @Param("password") String password);
    @Select("insert into news_user_t VALUES (null,#{username},#{password})")
    int addUserToDB(@Param("username") String username, @Param("password") String password);
}