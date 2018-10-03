package com.university.graduation.dao;

import com.university.graduation.domain.GraduationLink;
import com.university.graduation.domain.GraduationLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GraduationLinkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_link
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int countByExample(GraduationLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_link
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int deleteByExample(GraduationLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_link
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int deleteByPrimaryKey(Integer graduationLinkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_link
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int insert(GraduationLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_link
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int insertSelective(GraduationLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_link
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    List<GraduationLink> selectByExample(GraduationLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_link
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    GraduationLink selectByPrimaryKey(Integer graduationLinkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_link
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int updateByExampleSelective(@Param("record") GraduationLink record, @Param("example") GraduationLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_link
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int updateByExample(@Param("record") GraduationLink record, @Param("example") GraduationLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_link
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int updateByPrimaryKeySelective(GraduationLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table graduation_link
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int updateByPrimaryKey(GraduationLink record);
}