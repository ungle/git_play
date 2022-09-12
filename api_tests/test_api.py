import requests as requests
def test_hello():
	r = requests.get("http://52.77.244.25:9099/hello")
	assert r.text == "hello!"
def test_bye():
	r = requests.get("http://52.77.244.25:9099/bye")
	assert r.text == "see you again!"
