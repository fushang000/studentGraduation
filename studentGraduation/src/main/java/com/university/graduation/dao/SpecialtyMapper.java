package com.university.graduation.dao;

import com.university.graduation.domain.Specialty;
import com.university.graduation.domain.SpecialtyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialtyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialty
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int countByExample(SpecialtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialty
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int deleteByExample(SpecialtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialty
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int deleteByPrimaryKey(Integer specialtyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialty
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int insert(Specialty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialty
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int insertSelective(Specialty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialty
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    List<Specialty> selectByExample(SpecialtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialty
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    Specialty selectByPrimaryKey(Integer specialtyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialty
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int updateByExampleSelective(@Param("record") Specialty record, @Param("example") SpecialtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialty
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int updateByExample(@Param("record") Specialty record, @Param("example") SpecialtyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialty
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int updateByPrimaryKeySelective(Specialty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialty
     *
     * @mbggenerated Wed Oct 03 17:11:10 CST 2018
     */
    int updateByPrimaryKey(Specialty record);
}