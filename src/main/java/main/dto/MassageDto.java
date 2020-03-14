package main.dto;

import lombok.Data;

/**
 * @author HeJun
 * @version 1.0
 * @description
 * @Date $time$ $date$
 */
@Data
public class MassageDto {

    /**
     * 文本内容
     */
    private String content;

    /**
     * 图像路径 或 云地址
     * <p>
     * 如果是路径：待审核图像Base64编码字符串，* 以图像文件形式请求时必填 （格式如：/9j/4AAQSkZJRgABAQAASABIAAD/4QBYRXhpZgAATU0AKgAAAAgAAgESAAMAAAABAAYAAIdp）
     * 如果是云地址：网图URL地址，以网图形式请求，图像Url需要做UrlEncode （格式如：https://ai-solution-admin.cdn.bcebos.com/audit%2Fdemo%2Fcensoring-demo.jpg）
     */
    private String pathOrUrl;

    /**
     * 1:path  2.url
     */
    private Integer type;


}
