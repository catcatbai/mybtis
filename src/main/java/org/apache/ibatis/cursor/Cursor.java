/**
 *    Copyright 2009-2020 the original author or authors.
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
package org.apache.ibatis.cursor;

import java.io.Closeable;

/**
 * Cursor contract to handle fetching items lazily using an Iterator.
 * Cursors are a perfect fit to handle millions of items queries that would not normally fits in memory.
 * If you use collections in resultMaps then cursor SQL queries must be ordered (resultOrdered="true")
 * using the id columns of the resultMap.
 *
 * @author Guillaume Darmont / guillaume@dropinocean.com
 */
//游标契约使用迭代器惰性地处理抓取项。
//游标非常适合处理数百万项查询，而这些查询通常无法装入内存。
//如果在resultMaps中使用集合，则必须使用resultMap的id列对游标SQL查询进行排序(resultOrdered="true")。
public interface Cursor<T> extends Closeable, Iterable<T> {

  /**
   * @return true if the cursor has started to fetch items from database.
   */
  // 游标开始从数据库获取数据这个就返回true
  boolean isOpen();

  /**
   *
   * @return true if the cursor is fully consumed and has returned all elements matching the query.
   */
  // 判断所有元素是否已经获取完
  boolean isConsumed();

  /**
   * Get the current item index. The first item has the index 0.
   *
   * @return -1 if the first cursor item has not been retrieved. The index of the current item retrieved.
   */
  // 获取数据的索引，从0开始，如果没有数据就返回-1
  int getCurrentIndex();
}
