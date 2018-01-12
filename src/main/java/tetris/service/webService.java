package tetris.service;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import tetris.bean.TetrisRequest;
//import TetrisRequest;

import javax.websocket.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by jojo on 2018/1/2.
 */

public class webService {

    private static Map<String, Session> sessions = new HashMap<String, Session>();

    @OnMessage
    public void onMessage(Session session, String msg) throws IOException {
        System.out.println("收到信息");
        JSONObject jsonObject = JSONObject.parseObject(msg);
        TetrisRequest request = JSON.parseObject(msg, TetrisRequest.class);

        try {
            session.getBasicRemote().sendText("get");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnOpen
    public void onOpen(Session session, EndpointConfig config) {
        try {
            sessions.put(session.getId(), session);

            String replyStr = JSON.toJSONString("");

            session.getBasicRemote().sendText(replyStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnError
    public void onError(Session session, Throwable throwable) {

    }

    @OnClose
    public void onClose(Session session, CloseReason reason) {
        try {
            System.out.println("断开连接, id=" + session.getId());
            synchronized (sessions) {
                sessions.remove(session.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public TetrisRequest haha(String msg) {
//        System.out.println("收到信息");
//        JSONObject jsonObject = JSONObject.parseObject(msg);
//        TetrisRequest request = JSON.parseObject(msg, new TypeReference<TetrisRequest>() {
//        });
//        return request;
//    }
//
//    public static void main(String[] args) {
//        String msg = "{ \"blockType\" :4, \"tetrisScene\":[0,0,0,0,0,0,0,0,0,0]} ";
//        webService webService = new webService();
//        TetrisRequest request = webService.haha(msg);
//        System.out.println(request.getBlockType());
//    }

}
