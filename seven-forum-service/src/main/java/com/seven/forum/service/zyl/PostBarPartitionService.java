package com.seven.forum.service.zyl;

import com.seven.forum.entity.zyl.PostBarPartitionEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostBarPartitionService {

    List<PostBarPartitionEntity> listAllPartitionsAndCatalogues();
}
