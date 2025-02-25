(ns {{name}}.scenes.menu
  (:require [quil.core :as q]
            [quip.input :as input]
            [quip.scene :as scene]
            [quip.sprite :as sprite]
            [quip.sprites.button :as button]
            [quip.util :as u]))

(def white [230 230 230])
(def grey [57 57 58])
(def dark-green [41 115 115])

(defn on-click-play
  "Transition from this scene to `:level-01` with a ~500ms frame
  fade-out"
  [state _button]
  (scene/transition state :level-01 :transition-length (u/ms->frames 500)))

(defn sprites
  "The initial list of sprites for this scene"
  []
  [(-> (button/button-sprite "Play"
                             (u/make-pos [0.5 0.5])
                             :color grey
                             :content-color white)
       (input/on-click on-click-play))])

(defn draw-menu!
  "Called each frame, draws the current scene to the screen"
  [state]
  (u/background dark-green)
  (sprite/draw-scene-sprites! state))

(defn update-menu
  "Called each frame, update the sprites in the current scene"
  [state]
  (-> state
      sprite/update-state))

(defn init
  "Initialise this scene"
  []
  {:sprites   (sprites)
   :draw-fn   draw-menu!
   :update-fn update-menu})
