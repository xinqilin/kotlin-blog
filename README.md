# kotlin-blog-design

### RESET SQL

docker run --name mysql -d -p 3306:3306 -e "TZ=Asia/Taipei" -e MYSQL_ROOT_PASSWORD=mysql mysql:8

```mysql
    SELECT concat('DROP TABLE IF EXISTS `', table_name, '`;')
    FROM information_schema.tables
    WHERE table_schema = 'blog';
    
    DROP TABLE IF EXISTS `admin_user`;
    DROP TABLE IF EXISTS `blog`;
    DROP TABLE IF EXISTS `blog_category`;
    DROP TABLE IF EXISTS `blog_comment`;
    DROP TABLE IF EXISTS `blog_config`;
    DROP TABLE IF EXISTS `blog_link`;
    DROP TABLE IF EXISTS `blog_tag`;
    DROP TABLE IF EXISTS `blog_tag_relation`;
```

