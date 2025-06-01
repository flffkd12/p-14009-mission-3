package com.back.wiseSaying.service;

import com.back.wiseSaying.entitiy.WiseSaying;
import com.back.wiseSaying.repository.WiseSayingRepository;
import java.util.List;

public class WiseSayingService {

  private final WiseSayingRepository wiseSayingRepository = new WiseSayingRepository();

  public WiseSaying create(String content, String author) {
    return wiseSayingRepository.save(new WiseSaying(content, author));
  }

  public List<WiseSaying> getList() {
    return wiseSayingRepository.getAll();
  }

  public void update(int updateId, String content, String author) {
    wiseSayingRepository.update(new WiseSaying(updateId, content, author));
  }

  public void delete(int removeId) {
    wiseSayingRepository.remove(removeId);
  }

  public void mergeJsonFiles() {
    wiseSayingRepository.mergeJsonFilesAndSave();
  }
}
