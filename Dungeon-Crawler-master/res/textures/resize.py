from PIL import Image

img = Image.open('img/player_2.png')
w,h = img.size
img = img.resize((w,h))
img.save('player_2.png')
