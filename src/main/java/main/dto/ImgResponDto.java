package main.dto;

import lombok.Data;
import org.json.JSONArray;

import java.util.ArrayList;

/**
 * @author HeJun
 * @version 1.0
 * @description
 * @Date $time$ $date$
 */
@Data
public class ImgResponDto {


    private Long log_id; //Y	请求唯一id，用于问题排查
    private Long error_code; //  N 错误提示码，失败才返回，成功不返回
    private String error_msg; //   N 错误提示信息，失败才返回，成功不返回
    private String conclusion;//  N 审核结果，可取值描述：合规、不合规、疑似、审核失败
    private int conclusionType;//   N 审核结果类型，可取值1、2、3、4，分别代表1：合规，2：不合规，3：疑似，4：审核失败
    private ArrayList<ImgResponDataDto> data;//    N 不合规/疑似/命中白名单项详细信息。响应成功并且conclusion为疑似或不合规或命中白名单时才返回，响应失败或conclusion为合规且未命中白名单时不返回。

//  private  Integer  error_code  ;//    否 内层错误提示码，底层服务失败才返回，成功不返回
//
//   private String error_msg ;//    否 内层错误提示信息，底层服务失败才返回，成功不返回
//
//    private Integer type;//    N 结果具体命中的模型：0:百度官方违禁图库、1：色情识别、2：暴恐识别、3：恶心图识别、4:广告监测、5：政治敏感识别、6：图像质量检测、7：用户图像黑名单、8：用户图像白名单、9：图文审核、11：百度官方违禁词库、12：文本反作弊、13:自定义文本黑名单、14:自定义文本白名单、15:EasyDL自定义模型
//
//    private Integer subType;//审核子类型，此字段需参照type主类型字段决定其含义：//    当type=0时subType取值含义 :
//    //            0：
////    百度官方违禁图
////            当type = 1
////    时subType取值含义:0:一般色情、1:卡通色情、2：SM、3：低俗、4:儿童裸露、5：艺术品色情、6：性玩具、7：男性性感、8：自然男性裸露、9：女性性感、10：卡通女性性感、11:特殊类、12:亲密行为、13:
////    卡通亲密行为
////            当type = 2
////    时subType取值含义:
////            0:警察部队、1:血腥、2:尸体、3:爆炸火灾、4:杀人、5:暴乱、6:暴恐人物、7:军事武器、8:暴恐旗帜、9:血腥动物或动物尸体、10:
////    车祸
////            当type = 3
////    时subType取值含义:
////            0:
////    恶心图
////            当type = 4
////    时subType取值含义：0:水印、1:二维码、2:
////    条形码
////            当type = 5
////    时subType取值含义：0:政治敏感、1:公众人物、2:
////    自定义敏感人物
////            当type = 6
////    时subType取值含义:
////            0:图像清晰度、1:
////    图像美观度
////            当type = 7
////    时subType取值含义:
////            0:
////    用户自定义图像黑名单
////            当type = 8
////    时subType取值含义：
////            0:
////    用户自定义图像白名单
////            当type = 9
////    时subType取值含义：
////            0：图像中必须是真人脸
////1：人脸必须为正脸
////2：左右旋转角度
////3：俯仰角度
////4：歪头角度
////5：人脸不能有遮挡
////6：不能遮挡眼睛
////7：不能遮挡鼻子
////8：不能遮挡嘴
////9：不能遮挡下巴
////10：不能遮挡脸颊
////11：人脸不能佩戴墨镜
////12：人脸占比
////13：
////    人脸必须清晰
////            当type = 11
////    时subType取值含义：
////            0:
////    百度官方默认违禁词库
////            当type = 12
////    时subType取值含义：
////            0:低质灌水、1:暴恐违禁、2:文本色情、3:政治敏感、4恶意推广、5:
////    低俗辱骂
////            当type = 13
////    时subType取值含义：
////            0:
////    自定义文本黑名单
////            当type = 14
////    时subType取值含义：
////            0:自定义文本白名单
//    private String msg;//    N 不合规项描述信息
//
//    private Float probability;//    N 不合规项置信度
//
//    private Float datasetName;//    N 违规项目所属数据集名称
//
//    private ArrayList stars;//    N 敏感人物列表数组，只有敏感人物审核不通过才有
//
//    private String name;//    N 敏感人物名称
//
////    private Float probability;//    N 人脸相似度
////
////  private  Float  datasetName ;//    N 人脸所属数据集名称
//
//    private ArrayList hits;//    N 命中关键词信息
//
//    private String words;//    N 违规文本关键字
//
//    private ArrayList codes;//    N(如果您在策略配置中勾选了二维码识别)二维码或者条形码识别结果
//
//    private String modelName;//    N	（如果您勾选了EasyDL的模型）命中自定义模型名称
//
//    private Float score;//    N	（如果您勾选了EasyDL的模型）命中自定义模型置信度
//
//    private ArrayList modelId;//    N	（如果您勾选了EasyDL的模型）命中自定义模型ID
//
//    private String label;//    N	（如果您勾选了EasyDL的模型）命中自定义模型标签名称
//
//// private  int type ; //N    原生结果的类型1：色情识别、2：暴恐识别、3：恶心图识别、4:广告监测、5：政治敏感识别、6：图像质量检测、7：用户图像黑名单、8：用户图像白名单、9：图文审核
//
//    private JSONArray results;//    N 每个type可能会调用多个底层服务，此处可能有多个结果
}
