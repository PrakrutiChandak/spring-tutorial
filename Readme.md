# Bean Scopes
* Singleton - the beans are created only once per spring container. it is by default scope type.
* Prototype - new beans are created with every request or reference   
  Example: <bean id="triangle" class="org.prakruti.Triangle" autowire="byName" scope="prototype>
* Web-aware Context bean scopes
    * Request -  new bean per servlet request
    * Session - new bean per session. a bean per user per session
    * Global Session - new bean per global HTTP session
 
# Bean inheritance
 for list of beans, we can simply do <list merge="true"> to avoid overriding the existing properties
 
# Lifecycle callbacks
 * InitializingBean to perform after setting the properties 
 * DisposableBean to perform clean up process
 * these methods can also be created without any spring dependency  

default init/destroy methods can be set as mentioned
 
```
	 <beans default-init-method="Myinit" default-destroy-method="cleanUp">
```