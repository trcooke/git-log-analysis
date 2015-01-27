(defproject git-log-analysis "0.1.0-SNAPSHOT"
  :description "File commit analysis for git"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot git-log-analysis.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
