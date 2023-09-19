뷰 바인딩 - null 안정성을 보장한다.(기존 findviewByld에 비해 코드가 더욱 단순.)
        1. gradle을 먼저 설정한다.(module : app 단계에서 수행한다.)
android {

    viewBinding {
        enable = true
    }

    2. 각 xml파일에 바인딩 클래스를 확인한다.

    class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            // Use the binding object to replace direct references to views:
            binding.myButton.setOnClickListener { /* ... */ }
        }
    }