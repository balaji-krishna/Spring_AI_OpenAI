package com.microservices.springai.SpringAIDemo.service;

import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.stereotype.Service;

@Service
public class SpringAiService {

	public String getOpenAiResult(String inputPromptMessage) {
		OpenAiApi openAiApi = new OpenAiApi(System.getenv("OPENAI_API_KEY"));
		OpenAiChatClient chatClient = new OpenAiChatClient(openAiApi);
		ChatResponse response = chatClient.call(new Prompt(inputPromptMessage,
				OpenAiChatOptions.builder().withModel("gpt-3.5-turbo").withTemperature((float) 0.4).build()));
		return response.getResult().getOutput().toString();
	}

}
