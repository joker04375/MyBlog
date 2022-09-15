package com.serein.myblog.service.impl;

import com.serein.myblog.entity.Memory;
import com.serein.myblog.mapper.MemoryMapper;
import com.serein.myblog.service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemoryServiceImpl implements MemoryService {
    @Autowired
    private MemoryMapper memoryMapper;

    @Override
    public List<Memory> listMemory() {
        return memoryMapper.listMemory();
    }

    @Override
    public int saveMemory(Memory memory) {
        return memoryMapper.saveMemory(memory);
    }

    @Override
    public Memory getMemory(Long id) {
        return memoryMapper.getMemory(id);
    }

    @Override
    public int updateMemory(Memory memory) {
        return memoryMapper.updateMemory(memory);
    }

    @Override
    public void deleteMemory(Long id) {
        memoryMapper.deleteMemory(id);
    }
}
