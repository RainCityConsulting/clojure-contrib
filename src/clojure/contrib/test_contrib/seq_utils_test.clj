(ns clojure.contrib.test-contrib.seq-utils-test
  (:use clojure.test
	clojure.contrib.seq-utils))


(deftest test-positions
  (are [expected pred coll] (= expected (positions pred coll))
       [1] nil [0 nil 5]
       [1] nil? [0 nil 5]
       () string? [:a :b :c]
       [2] string? [:a :b "c"]
       () :d [:a :b :c]
       [0 2] :d [:d :a :d :a]))
  