/**
 * 
 */
package org.yankun.kms.entity.article;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author yankun
 *
 */
public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5915335834029063126L;
	/**
	 * Article Id
	 */
	@NotNull
	private Serializable id;
	/**
	 * Article Subject
	 */
	@NotNull(message = "Title不能为空")
	@Length(min = 5, max = 20, message="用户名长度必须在5-20之间")
	@Pattern(regexp = "^[a-zA-Z_]\\w{4,19}$", message = "用户名必须以字母下划线开头，可由字母数字下划线组成")
	private String subject;
	/**
	 * Article Content
	 */
	@NotNull
	private String content;
	/**
	 * Article create time;
	 */
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
	/**
	 * Article update time;
	 */
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

}
