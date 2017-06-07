/**
 * 不要因为走了很远就忘记当初出发的目的:whatever happened,be yourself
 */
package com.xiaoyu.modules.biz.article.vo;

import com.xiaoyu.common.base.BaseEntity;

/**
 * @author xiaoyu 2016年3月29日
 */
public class ArticleCommentVo extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String articleId;
	private String replyerName;
	private String replyerAvatar;
	private String authorId;
	private String parentId;
	private String content;
	private String replyerId;

	public String getArticleId() {
		return articleId;
	}

	public ArticleCommentVo setArticleId(String articleId) {
		this.articleId = articleId;
		return this;
	}

	public String getAuthorId() {
		return authorId;
	}

	public ArticleCommentVo setAuthorId(String authorId) {
		this.authorId = authorId;
		return this;
	}

	public String getParentId() {
		return parentId;
	}

	public ArticleCommentVo setParentId(String parentId) {
		this.parentId = parentId;
		return this;
	}

	public String getContent() {
		return content;
	}

	public ArticleCommentVo setContent(String content) {
		this.content = content;
		return this;
	}

	public String getReplyerId() {
		return replyerId;
	}

	public ArticleCommentVo setReplyerId(String replyerId) {
		this.replyerId = replyerId;
		return this;
	}

}