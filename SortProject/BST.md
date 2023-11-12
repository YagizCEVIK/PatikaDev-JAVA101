** Binary Search Tree (BST) ** oluşturulurken, her yeni eleman karşılaştırma yaparak uygun konuma yerleştirilir. İlk eleman root olur. Root’tan küçük elemanlar sol tarafa, büyük olanlar sağ tarafa eklenir. İşte [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisi için BST oluşturma aşamaları:

İlk eleman 7, bu yüzden root 7’dir.
* 5, root’tan küçük olduğu için sol tarafa eklenir.
* 1, 5’ten küçük olduğu için 5’in soluna eklenir.
* 8, root’tan büyük olduğu için sağ tarafa eklenir.
* 3, 5’ten küçük ama 1’den büyük olduğu için 1’in sağına eklenir.
* 6, 7’den küçük ama 5’ten büyük olduğu için 5’in sağına eklenir.
* 0, 1’den küçük olduğu için 1’in soluna eklenir.
* 9, 8’den büyük olduğu için 8’in sağına eklenir.
* 4, 5’ten küçük ama 3’ten büyük olduğu için 3’ün sağına eklenir.
* 2, 3’ten küçük ama 1’den büyük olduğu için 1’in sağına eklenir.
----------------

**Sonuç olarak oluşan BST’nin düğümleri şu şekildedir:**

Root: 7
- 7’nin solunda: 5
- 5’in solunda: 1
- 1’in solunda: 0
- 1’in sağında: 2
- 5’in sağında: 6
- 6’ın sağında: 4
- 7’nin sağında: 8
- 8’in sağında: 9
-------------------------


**Bu şekilde bir BST oluşturulduğunda, arama işlemleri için ortalama ve en kötü durum zaman karmaşıklığı ***O(log n)***'dir. Ancak, bu durum dengeli bir ağaç için geçerlidir. Dengesiz ağaçlarda en kötü durum zaman karmaşıklığı ***O(n)*** olabilir. Bu nedenle, dengeli bir BST oluşturmak için dizi önceden sıralanabilir veya AVL ağaçları gibi dengeli ağaç yapıları kullanılabilir.**