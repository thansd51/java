package example;

public class Split_String {

	public static void main(String[] args) {
		String text1 = "Sen. Joe Manchin III (D-W.Va.) on Wednesday reached a deal with Democratic leaders on a spending package that aims to lower health-care costs, combat climate change and reduce the federal deficit, marking a massive potential breakthrough for President Biden’s long-stalled economic agenda.\r\n"
				+ "\r\n"
				+ "The new agreement, brokered between Manchin and Senate Majority Leader Charles E. Schumer (D-N.Y.), opens the door for party lawmakers to try to advance the measure next week. It caps off months of fierce debate, delay and acrimony, a level of infighting that some Democrats saw as detrimental to their political fate ahead of this fall’s critical elections.\r\n"
				+ "\r\n"
				+ "Under the deal, Schumer secured Manchin’s support for roughly $433 billion in new spending, most of which is focused on climate change and clean energy production. It is the largest such investment in U.S. history, and a marked departure from Manchin’s position only days earlier. The Democrats coupled the spending with provisions that aim to lower health-care costs for Americans, chiefly by allowing Medicare to begin negotiating the price of select prescription drugs on behalf of seniors.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "To pay for the package, Manchin and Schumer also settled on a series of changes to tax law that would raise $739 billion over the next decade — enough to offset the cost of the bill while securing more than $300 billion for cutting the deficit, a priority for Manchin. Democrats sourced the funds from proposals including a new minimum tax on corporations and fresh investments in the Internal Revenue Service that will help it pursue tax cheats.\r\n"
				+ "\r\n"
				+ "Read the text of the Schumer-Manchin deal\r\n"
				+ "\r\n"
				+ "Taken together, the package represents more than some Democrats once thought they might win from Manchin, who repeatedly has raised fiscal concerns with his own party’s ambitions. Only two weeks ago, the moderate from West Virginia, a coal-heavy state, signaled his opposition to new climate investments out of a fear that spending increases — funded in part by tax hikes — could harm the economy and worsen inflation.\r\n"
				+ "\r\n"
				+ "“This is the most significant action we’ve taken on climate, that we will take on climate and clean energy, ever,” said Sen. Tina Smith (D-Minn.), who led Democrats on a plan that would have punished polluters in the electricity sector before Manchin blocked it.";
		String text2 = "에당 아자르가 비디오판독(VAR)에 대해 부정적인 견해를 나타냈다.\r\n" + "\r\n"
				+ "공식적인 규칙이 도입된 후, 축구는 매 순간 변화를 맞이했다. 경기를 치를수록 규정을 바꿨고 오프사이드, 간접 프리킥 등이 새롭게 도입됐다. 이러한 변화는 처음엔 어색했지만 시간이 흐를수록 자연스러운 경기의 일부로 인정됐다.\r\n"
				+ "\r\n"
				+ "그리고 2016년 축구에 또 다른 거대한 변화가 일어났다. 국제축구연맹(FIFA)이 공정성을 더하기 위해 VAR 시스템을 도입한 것이다. 이는 주심의 판정이 잘못됐을 경우를 대비해 경기에 결정적인 영향을 미치는 장면을 비디오 판독을 통해 판단하는 것이다. 2016 FIFA 클럽월드컵 때 처음으로 도입됐으며 이후 그 범위를 넓혔다. K리그 역시 2017년부터 VAR을 도입했으며 K리그2는 2018시즌부터 VAR을 받아들였다.\r\n"
				+ "\r\n"
				+ "급작스러운 변화만큼이나 시행착오도 있었다. VAR로 인해 경기의 흐름을 끊는다는 의견도 있었고 1mm 정도로 오프사이드로 판정돼 골이 취소되는 경우엔 허탈감마저 느꼈다. 확실히 공정해졌다는 긍정적인 평가도 있었지만 축구의 재미가 반감됐다는 비판도 있었다.\r\n"
				+ "\r\n"
				+ "이는 VAR을 몸소 체험하는 선수들에게도 마찬가지였다. 첼시를 거쳐 레알 마드리드에서 활약하는 아자르는 최근 VAR에 대해 부정적인 견해를 밝혔다. 그는 글로벌 매체 'ESPN'과의 인터뷰에서 \"축구에서 한 가지만 바꿀 수 있다면 무엇을 바꿀 것인가?\"라는 질문을 받았다.\r\n"
				+ "\r\n"
				+ "이에 그는 \"경기에 관한 거죠? 잠시만 생각할게요\"라고 말했다. 이어 \"VAR을 없앨게요. 난 이 제도가 너무 싫어요\"라며 답했다. 이어 \"주심이 실수를 저지르는 것도 축구의 일부에요. 사람들이 이것에 대해 불평을 했기 때문에 VAR이 나왔죠. 하지만 득점이 터진 뒤에 우리들은 VAR이 아닌지 확인하기 위해 기다려야 해요. 이 순간이 정말 싫어요\"라고 이유를 설명했다.\r\n"
				+ "\r\n"
				+ "맨체스터 유나이티드에서 활약했던 리오 퍼디난드는 다소 다른 입장이었다. 그는 VAR의 도입을 긍정적으로 평가했다. 하지만 잉글리시 프리미어리그(EPL)에서처럼, 너무 많은 시간을 잡아먹으면 안된다고 생각했다.\r\n"
				+ "\r\n"
				+ "퍼디난드는 \"VAR은 상황을 해결하는 데 도움을 주기 때문에 괜찮다. 국제 대회에서 VAR 판정은 EPL보다 빠르고 즉각적이다. 그래서 훨씬 좋다\"라며 \"VAR은 우리에게 이야기와 대화 거리를 더 제공해준다\"라며 자신의 생각을 드러냈다.";

//		String[] words = text2.split("[^가-힣]+");
		String[] words = text1.split("[^a-zA-Z]+");

		for (String w : words) {
			if(w.length() < 2) {
				continue;
			}
			System.out.println(w);
		}
	}
}