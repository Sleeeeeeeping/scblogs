package cn.sticki.blog.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogSaveDTO {

	/**
	 * 博客id(若无则不填)
	 */
	Integer id;

	/**
	 * 作者
	 */
	String author;

	/**
	 * 标题
	 */
	String title;

	/**
	 * 描述
	 */
	String description;

	/**
	 * 内容(md格式)
	 */
	String content;

	/**
	 * 博客状态码
	 */
	Integer status;

	/**
	 * 封面图
	 */
	MultipartFile coverImageFile;

}
