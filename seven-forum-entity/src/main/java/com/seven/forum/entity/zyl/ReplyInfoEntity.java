package com.seven.forum.entity.zyl;


import lombok.Data;

import java.util.Date;

@Data
public class ReplyInfoEntity {

    private Long replyId;
    private Long userId;
    private Long replyUserId;
    private String replyContent;
    private Date replyTime;
    private Integer replyStatus;

    @Override
    public String toString() {
        return "ReplyInfoEntity{" +
                "replyId=" + replyId +
                ", userId=" + userId +
                ", replyUserId=" + replyUserId +
                ", replyContent='" + replyContent + '\'' +
                ", replyTime=" + replyTime +
                ", replyStatus=" + replyStatus +
                '}';
    }
}
