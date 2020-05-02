package com.dschroeder.tagcaddy.services;

import com.dschroeder.tagcaddy.model.Hashtag;

public interface HashtagService extends CrudService<Hashtag, Long>, RetrieveByUserService<Hashtag> {
}