package com.unbank.robotspider.dao;

import com.unbank.robotspider.entity.ArticleInfo;
import com.unbank.robotspider.entity.ArticleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ptf_crawl
	 * @mbggenerated  Wed Aug 20 18:04:02 CST 2014
	 */
	int countByExample(ArticleInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ptf_crawl
	 * @mbggenerated  Wed Aug 20 18:04:02 CST 2014
	 */
	int deleteByExample(ArticleInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ptf_crawl
	 * @mbggenerated  Wed Aug 20 18:04:02 CST 2014
	 */
	int deleteByPrimaryKey(Integer crawlId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ptf_crawl
	 * @mbggenerated  Wed Aug 20 18:04:02 CST 2014
	 */
	int insert(ArticleInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ptf_crawl
	 * @mbggenerated  Wed Aug 20 18:04:02 CST 2014
	 */
	int insertSelective(ArticleInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ptf_crawl
	 * @mbggenerated  Wed Aug 20 18:04:02 CST 2014
	 */
	List<ArticleInfo> selectByExample(ArticleInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ptf_crawl
	 * @mbggenerated  Wed Aug 20 18:04:02 CST 2014
	 */
	ArticleInfo selectByPrimaryKey(Integer crawlId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ptf_crawl
	 * @mbggenerated  Wed Aug 20 18:04:02 CST 2014
	 */
	int updateByExampleSelective(@Param("record") ArticleInfo record,
			@Param("example") ArticleInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ptf_crawl
	 * @mbggenerated  Wed Aug 20 18:04:02 CST 2014
	 */
	int updateByExample(@Param("record") ArticleInfo record,
			@Param("example") ArticleInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ptf_crawl
	 * @mbggenerated  Wed Aug 20 18:04:02 CST 2014
	 */
	int updateByPrimaryKeySelective(ArticleInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ptf_crawl
	 * @mbggenerated  Wed Aug 20 18:04:02 CST 2014
	 */
	int updateByPrimaryKey(ArticleInfo record);
}