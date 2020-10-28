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
 * @author Clinton Begin
 */
public enum ExecutorType {
  /*@baido
  *   SIMPLE 每执行一次update或select，就开启一个Statement对象，用完立刻关闭Statement对象）
  *   REUSE Map存储，sql为key，Stattemnt不关闭，
  *   BATCH 批量处理
  *   参考：https://www.cnblogs.com/wwct/p/12994222.html
  * */
  SIMPLE, REUSE, BATCH
}
