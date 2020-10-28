/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.session;

/**
 * @author Eduardo Macarron
 */
public enum LocalCacheScope {
  /*
  * @baido SESSION 一个链接， STATEMENT 一个sql语句。 代表缓存的存在时长 Scope
  *   参考：http://blog.itpub.net/35489/viewspace-611691/
  * */
  SESSION,STATEMENT
}
