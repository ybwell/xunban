CollectionUtils.isEmpty()
Arrays.asList()
用户脱敏
lambda表达式：list.stream() parallelStream  stream的collector
userList.stream().map(this::getSafetyUser).collect(Collectors.toList())

Gson
判空：Optional.ofNullable().orElse()
easyexcell

HttpServletRequest
密码加盐 分布式session