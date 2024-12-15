(ns {{name}}.scenes.level-01
  (:require [quip.sprite :as sprite]
            [quip.util :as u]))

(def light-green [133 255 199])

(defn sprites
  "The initial list of sprites for this scene"
  []
  [(sprite/text-sprite "Add some sprites!" (u/make-pos [0.5 0.5]))])

(defn draw-level-01!
  "Called each frame, draws the current scene to the screen"
  [state]
  (u/background light-green)
  (sprite/draw-scene-sprites! state))

(defn update-level-01
  "Called each frame, update the sprites in the current scene"
  [state]
  (-> state
      sprite/update-state))

(defn init
  "Initialise this scene"
  []
  {:sprites   (sprites)
   :draw-fn   draw-level-01!
   :update-fn update-level-01})
