package com.mimile.mapper;

import com.mimile.beans.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {
    public Article getArticle(int id);
}
