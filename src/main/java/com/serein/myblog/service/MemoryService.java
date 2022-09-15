package com.serein.myblog.service;

import com.serein.myblog.entity.Memory;

import java.util.List;

public interface MemoryService {
    List<Memory> listMemory();

    int saveMemory(Memory memory);

    Memory getMemory(Long id);

    int updateMemory(Memory memory);

    void deleteMemory(Long id);
}
