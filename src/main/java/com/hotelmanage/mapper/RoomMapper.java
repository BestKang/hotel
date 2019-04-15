package com.hotelmanage.mapper;

import com.hotelmanage.pojo.entity.room.Room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoomMapper {
    //获取单间房详细信息
    Room getRoom(@Param("room_id") String room_id);

    //房间信息增加
    Integer addRoom(Room room);

    //房间信息修改
    Integer updateInfo(Room room);

    //所有房间列表
    List<Room> getRoomList();

    //分类房间列表（房间类型）
    List<Room> getRoomListByRoomType(@Param("room_type") String room_type);

    //分类房间列表（床铺类型）
    List<Room> getRoomListByBedType(@Param("room_type") String room_type);

    //分类房间列表（房间状态      管理员可用）
    List<Room> getRoomListByStatus();
}
