class Rational(n: Int, d: Int) {
  // 引数チェック
  require(d != 0)

  // 非公開のフィールド
  private val g = gcd(n.abs, d.abs)

  // フィールド宣言
  val numer = n / g
  val denom = d / g
  
  // 補助コンストラクタ
  def this(n: Int) = this(n, 1)

  // java.lang.ObjectのtoStringのオーバーライド
  override def toString = numer + "/" + denom

  // 分数の加算
  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom *that.denom
    )

  // 分数と整数の加算
  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)
  
  // 分数の減算
  def - (that: Rational): Rational = 
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  // 分数と整数の減算
  def - (i: Int): Rational = 
    new Rational(numer - i * denom, denom)
  
  // 分数の乗算
  def * (that: Rational): Rational = 
    new Rational(
      numer * that.numer,
      denom * that.denom
    )

  // 分数と整数の乗算
  def * (i: Int): Rational =
    new Rational(numer * i, denom)

  // 分数の除算
  def / (that: Rational): Rational =
    new Rational(
      numer * that.denom,
      denom * that.numer
    )

  // 分数と整数の序算
  def / (i: Int): Rational = 
    new Rational(numer, denom * i)

  // 大小比較
  def lessThan(that: Rational) = 
    this.numer * that.denom < that.numer * this.denom

  // 大きい方を返す
  def max(that: Rational) =
    if (lessThan(that)) that else this

  // 最大公約数を求める
  private def gcd(a: Int, b: Int): Int = 
    if (b == 0) a else gcd(b, a % b)
}
