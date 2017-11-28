(ns new-grad-template.handler-test
  (:require [midje.sweet :refer :all]
            [ring.mock.request :as mock]
            [new-grad-template.handler :refer :all]))

(fact "on main route"
      (let [response (app (mock/request :get "/"))]
        (:status response) => 200
        (:body response) => "Hello World"))

(fact "not found route"
      (let [response (app (mock/request :get "/invalid"))]
        (:status response) => 404))
