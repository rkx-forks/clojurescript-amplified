(ns app.amplified.views
  (:require [app.components.greetings :as greetings]
            [app.components.song :as song]
            [re-frame.core :as r]))

(defn header []
  [:h2 "Clojure. Amplified."])

(defn panels []
  [:div {:style {:max-width "350px"}}
   [header]
   [greetings/welcome @(r/subscribe [:app/username])]
   [song/song-card]])