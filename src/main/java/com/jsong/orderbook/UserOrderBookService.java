package com.jsong.orderbook;

import java.math.BigDecimal;
import java.util.*;

/**
 * 用户端OrderBook
 *
 */
public class UserOrderBookService {


    /**
     * 取出排序OrderBook
     */
    public SortedMap<BigDecimal, OrderBook> retOrderBookList(){

        SortedMap<BigDecimal,OrderBook> sort=new TreeMap<BigDecimal,OrderBook>();


        // 从币安获取OrderBook
        SortedMap<BigDecimal,OrderBook> binanOrderBook = new TreeMap<BigDecimal,OrderBook>();
        // 从货币获取OrderBook
        SortedMap<BigDecimal,OrderBook> huobiOrderBook = new TreeMap<BigDecimal,OrderBook>();

        // 从币安获取OrderBook
        // SetMultimap<BigDecimal,OrderBook> binanOrderBook = new SortedSetMultimap<BigDecimal, OrderBook>() {
        //     @Override
        //     public SortedSet<OrderBook> get(@Nullable BigDecimal bigDecimal) {
        //         return null;
        //     }
        //
        //     @Override
        //     public Set<BigDecimal> keySet() {
        //         return null;
        //     }
        //
        //     @Override
        //     public Multiset<BigDecimal> keys() {
        //         return null;
        //     }
        //
        //     @Override
        //     public Collection<OrderBook> values() {
        //         return null;
        //     }
        //
        //     @Override
        //     public SortedSet<OrderBook> removeAll(@Nullable Object o) {
        //         return null;
        //     }
        //
        //     @Override
        //     public void clear() {
        //
        //     }
        //
        //     @Override
        //     public int size() {
        //         return 0;
        //     }
        //
        //     @Override
        //     public boolean isEmpty() {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean containsKey(@Nullable Object o) {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean containsValue(@Nullable Object o) {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean containsEntry(@Nullable Object o, @Nullable Object o1) {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean put(@Nullable BigDecimal bigDecimal, @Nullable OrderBook orderBook) {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean remove(@Nullable Object o, @Nullable Object o1) {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean putAll(@Nullable BigDecimal bigDecimal, Iterable<? extends OrderBook> iterable) {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean putAll(Multimap<? extends BigDecimal, ? extends OrderBook> multimap) {
        //         return false;
        //     }
        //
        //     @Override
        //     public SortedSet<OrderBook> replaceValues(BigDecimal bigDecimal, Iterable<? extends OrderBook> iterable) {
        //         return null;
        //     }
        //
        //     @Override
        //     public Set<Map.Entry<BigDecimal, OrderBook>> entries() {
        //         return null;
        //     }
        //
        //     @Override
        //     public Map<BigDecimal, Collection<OrderBook>> asMap() {
        //         return null;
        //     }
        //
        //     @Override
        //     public boolean equals(@Nullable Object o) {
        //         return false;
        //     }
        //
        //     @Override
        //     public int hashCode() {
        //         return 0;
        //     }
        //
        //     @Override
        //     public Comparator<? super OrderBook> valueComparator() {
        //         return null;
        //     }
        // };
        //
        // // 从货币获取OrderBook
        // SetMultimap<BigDecimal,OrderBook> huobiOrderBook = new SortedSetMultimap<BigDecimal, OrderBook>() {
        //     @Override
        //     public SortedSet<OrderBook> get(@Nullable BigDecimal bigDecimal) {
        //         return null;
        //     }
        //
        //     @Override
        //     public Set<BigDecimal> keySet() {
        //         return null;
        //     }
        //
        //     @Override
        //     public Multiset<BigDecimal> keys() {
        //         return null;
        //     }
        //
        //     @Override
        //     public Collection<OrderBook> values() {
        //         return null;
        //     }
        //
        //     @Override
        //     public SortedSet<OrderBook> removeAll(@Nullable Object o) {
        //         return null;
        //     }
        //
        //     @Override
        //     public void clear() {
        //
        //     }
        //
        //     @Override
        //     public int size() {
        //         return 0;
        //     }
        //
        //     @Override
        //     public boolean isEmpty() {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean containsKey(@Nullable Object o) {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean containsValue(@Nullable Object o) {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean containsEntry(@Nullable Object o, @Nullable Object o1) {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean put(@Nullable BigDecimal bigDecimal, @Nullable OrderBook orderBook) {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean remove(@Nullable Object o, @Nullable Object o1) {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean putAll(@Nullable BigDecimal bigDecimal, Iterable<? extends OrderBook> iterable) {
        //         return false;
        //     }
        //
        //     @Override
        //     public boolean putAll(Multimap<? extends BigDecimal, ? extends OrderBook> multimap) {
        //         return false;
        //     }
        //
        //     @Override
        //     public SortedSet<OrderBook> replaceValues(BigDecimal bigDecimal, Iterable<? extends OrderBook> iterable) {
        //         return null;
        //     }
        //
        //     @Override
        //     public Set<Map.Entry<BigDecimal, OrderBook>> entries() {
        //         return null;
        //     }
        //
        //     @Override
        //     public Map<BigDecimal, Collection<OrderBook>> asMap() {
        //         return null;
        //     }
        //
        //     @Override
        //     public boolean equals(@Nullable Object o) {
        //         return false;
        //     }
        //
        //     @Override
        //     public int hashCode() {
        //         return 0;
        //     }
        //
        //     @Override
        //     public Comparator<? super OrderBook> valueComparator() {
        //         return null;
        //     }
        // };


        // merge操作，需要处理价格信息
        sort.putAll(binanOrderBook);

        // 统计合并相同价格, TODO
        Set<Map.Entry<BigDecimal, OrderBook>> entry = sort.entrySet();
        Iterator<Map.Entry<BigDecimal, OrderBook>> it= entry.iterator();
        while(it.hasNext())
        {
            Map.Entry<BigDecimal, OrderBook> inter = it.next();
            


        }

        return sort;

    }

}
