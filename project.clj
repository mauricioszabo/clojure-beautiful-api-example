(defproject clojure-sugar "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.novemberain/langohr "4.1.0"]
                 [compojure "1.6.0"]]
  :main ^:skip-aot clojure-sugar.core
  :target-path "target/%s"

  :profiles {:uberjar {:aot :all}})
