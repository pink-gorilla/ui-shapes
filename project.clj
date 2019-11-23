(defproject awb99/shapes "0.1.1"
  :description "A shapes library"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.7.1"

  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript "1.9.854"]]

  :source-paths ["src"]
  :cljsbuild {:builds []}
  :deploy-via :clojars
  :lein-release {:deploy-via :clojars
                 :scm        :git})