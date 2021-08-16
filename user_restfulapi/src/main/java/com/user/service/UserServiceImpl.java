package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.UserEntity;


@Service
public class UserServiceImpl implements UserService {

	//fake user List which we will get from database
		List<UserEntity> list = List.of(
				new UserEntity(1311L,"Prajwal Khatri","9293107277"),
				new UserEntity(1312L,"Nagen Kumar","9974542323"),
				new UserEntity(1313L,"Prabhat Anand","6465492356")
				
				
				);
		public UserEntity getUser(Long userID) {
			return this.list.stream().filter(user->user.getUserID().equals(userID)).findAny().orElse(null);
		}

}
