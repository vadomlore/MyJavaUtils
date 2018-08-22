package com.zyl.collection;

import java.util.*;

public abstract class CollectioUtility {

  public static <T> List<T> ofList() {
    return Collections.emptyList();
  }

  public static <T> List<T> ofList(T... args) {
    return Arrays.asList(args);
  }

  public static <T> Set<T> ofSet() {
    return Collections.emptySet();
  }

  public static <T> Set<T> ofSet(T... args) {
    return new HashSet<T>(Arrays.asList(args));
  }

  public static <K, V> Map<K, V> ofMap() {
    return Collections.emptyMap();
  }

  public static <K, V> Map<K, V> ofMap(K k1, V v1) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(K k1, V v1, K k2, V v2) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(K k1, V v1, K k2, V v2, K k3, V v3) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    map.put(k5, v5);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    map.put(k5, v5);
    map.put(k6, v6);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(
      K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    map.put(k5, v5);
    map.put(k6, v6);
    map.put(k7, v7);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(
      K k1,
      V v1,
      K k2,
      V v2,
      K k3,
      V v3,
      K k4,
      V v4,
      K k5,
      V v5,
      K k6,
      V v6,
      K k7,
      V v7,
      K k8,
      V v8) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    map.put(k5, v5);
    map.put(k6, v6);
    map.put(k7, v7);
    map.put(k8, v8);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(
      K k1,
      V v1,
      K k2,
      V v2,
      K k3,
      V v3,
      K k4,
      V v4,
      K k5,
      V v5,
      K k6,
      V v6,
      K k7,
      V v7,
      K k8,
      V v8,
      K k9,
      V v9) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    map.put(k5, v5);
    map.put(k6, v6);
    map.put(k7, v7);
    map.put(k8, v8);
    map.put(k9, v9);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(
      K k1,
      V v1,
      K k2,
      V v2,
      K k3,
      V v3,
      K k4,
      V v4,
      K k5,
      V v5,
      K k6,
      V v6,
      K k7,
      V v7,
      K k8,
      V v8,
      K k9,
      V v9,
      K k10,
      V v10) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    map.put(k5, v5);
    map.put(k6, v6);
    map.put(k7, v7);
    map.put(k8, v8);
    map.put(k9, v9);
    map.put(k10, v10);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(
      K k1,
      V v1,
      K k2,
      V v2,
      K k3,
      V v3,
      K k4,
      V v4,
      K k5,
      V v5,
      K k6,
      V v6,
      K k7,
      V v7,
      K k8,
      V v8,
      K k9,
      V v9,
      K k10,
      V v10,
      K k11,
      V v11) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    map.put(k5, v5);
    map.put(k6, v6);
    map.put(k7, v7);
    map.put(k8, v8);
    map.put(k9, v9);
    map.put(k10, v10);
    map.put(k11, v11);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(
      K k1,
      V v1,
      K k2,
      V v2,
      K k3,
      V v3,
      K k4,
      V v4,
      K k5,
      V v5,
      K k6,
      V v6,
      K k7,
      V v7,
      K k8,
      V v8,
      K k9,
      V v9,
      K k10,
      V v10,
      K k11,
      V v11,
      K k12,
      V v12) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    map.put(k5, v5);
    map.put(k6, v6);
    map.put(k7, v7);
    map.put(k8, v8);
    map.put(k9, v9);
    map.put(k10, v10);
    map.put(k11, v11);
    map.put(k12, v12);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(
      K k1,
      V v1,
      K k2,
      V v2,
      K k3,
      V v3,
      K k4,
      V v4,
      K k5,
      V v5,
      K k6,
      V v6,
      K k7,
      V v7,
      K k8,
      V v8,
      K k9,
      V v9,
      K k10,
      V v10,
      K k11,
      V v11,
      K k12,
      V v12,
      K k13,
      V v13) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    map.put(k5, v5);
    map.put(k6, v6);
    map.put(k7, v7);
    map.put(k8, v8);
    map.put(k9, v9);
    map.put(k10, v10);
    map.put(k11, v11);
    map.put(k12, v12);
    map.put(k13, v13);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(
      K k1,
      V v1,
      K k2,
      V v2,
      K k3,
      V v3,
      K k4,
      V v4,
      K k5,
      V v5,
      K k6,
      V v6,
      K k7,
      V v7,
      K k8,
      V v8,
      K k9,
      V v9,
      K k10,
      V v10,
      K k11,
      V v11,
      K k12,
      V v12,
      K k13,
      V v13,
      K k14,
      V v14) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    map.put(k5, v5);
    map.put(k6, v6);
    map.put(k7, v7);
    map.put(k8, v8);
    map.put(k9, v9);
    map.put(k10, v10);
    map.put(k11, v11);
    map.put(k12, v12);
    map.put(k13, v13);
    map.put(k14, v14);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(
      K k1,
      V v1,
      K k2,
      V v2,
      K k3,
      V v3,
      K k4,
      V v4,
      K k5,
      V v5,
      K k6,
      V v6,
      K k7,
      V v7,
      K k8,
      V v8,
      K k9,
      V v9,
      K k10,
      V v10,
      K k11,
      V v11,
      K k12,
      V v12,
      K k13,
      V v13,
      K k14,
      V v14,
      K k15,
      V v15) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    map.put(k5, v5);
    map.put(k6, v6);
    map.put(k7, v7);
    map.put(k8, v8);
    map.put(k9, v9);
    map.put(k10, v10);
    map.put(k11, v11);
    map.put(k12, v12);
    map.put(k13, v13);
    map.put(k14, v14);
    map.put(k15, v15);
    return map;
  }

  public static <K, V> Map<K, V> ofMap(
      K k1,
      V v1,
      K k2,
      V v2,
      K k3,
      V v3,
      K k4,
      V v4,
      K k5,
      V v5,
      K k6,
      V v6,
      K k7,
      V v7,
      K k8,
      V v8,
      K k9,
      V v9,
      K k10,
      V v10,
      K k11,
      V v11,
      K k12,
      V v12,
      K k13,
      V v13,
      K k14,
      V v14,
      K k15,
      V v15,
      K k16,
      V v16) {
    Map map = new HashMap<K, V>();
    map.put(k1, v1);
    map.put(k2, v2);
    map.put(k3, v3);
    map.put(k4, v4);
    map.put(k5, v5);
    map.put(k6, v6);
    map.put(k7, v7);
    map.put(k8, v8);
    map.put(k9, v9);
    map.put(k10, v10);
    map.put(k11, v11);
    map.put(k12, v12);
    map.put(k13, v13);
    map.put(k14, v14);
    map.put(k15, v15);
    map.put(k16, v16);
    return map;
  }
}
