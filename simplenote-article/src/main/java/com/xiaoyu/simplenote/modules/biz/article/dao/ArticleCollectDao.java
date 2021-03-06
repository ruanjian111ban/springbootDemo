/**
 * 不要因为走了很远就忘记当初出发的目的:whatever happened,be yourself
 */
package com.xiaoyu.simplenote.modules.biz.article.dao;

import org.springframework.stereotype.Repository;

import com.xiaoyu.simplenote.common.base.BaseDao;
import com.xiaoyu.simplenote.modules.biz.article.entity.ArticleCollect;

/**
 * @author xiaoyu 2016年3月29日
 */
@Repository
public interface ArticleCollectDao extends BaseDao<ArticleCollect> {

    ArticleCollect getForUpdate(ArticleCollect t);

}
