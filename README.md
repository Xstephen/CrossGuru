# CrossGuru
mly 
将数据库添加了进去，实体类包entity，会话bean包session，受管bean包manager，默认生成的jsf页放在jsfdefault文件夹下。jdbc数据源的jndi为jdbc/crossguru。
如果要使用自己的数据源把glassfish-resource文件删掉，将persistence文件里的数据源改为自己的就行了。
提交的时候就不要提交对glassfish-resource文件和persistence文件的更改