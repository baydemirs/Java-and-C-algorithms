# 12 - En Kısa Yol: Dijkstra

Dijkstra, kenar ağırlıkları negatif olmayan graph'larda bir başlangıç düğümünden diğer düğümlere en kısa mesafeyi bulur. Priority queue ile karmaşıklık yaklaşık `O((V + E) log V)` olur.

Negatif kenar varsa Dijkstra doğru sonuç garantisi vermez; bu durumda Bellman-Ford gibi başka bir algoritma gerekir.

Alıştırmalar:

1. Mesafenin yanında en kısa yolu da geri oluşturun.
2. Ulaşılamayan düğümleri kullanıcıya açık biçimde gösterin.
3. Aynı graph'ı adjacency matrix ile temsil edip maliyeti karşılaştırın.

